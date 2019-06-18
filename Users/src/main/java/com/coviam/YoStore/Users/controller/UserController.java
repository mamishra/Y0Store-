package com.coviam.YoStore.Users.controller;

import com.coviam.YoStore.Users.dto.UsersDTO;
import com.coviam.YoStore.Users.entity.Users;
import com.coviam.YoStore.Users.service.UsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UsersService usersService;

    @RequestMapping(method = RequestMethod.GET,value = "/findAll")
    public ResponseEntity<Iterable<Users>> findAll(){
        Iterable<Users> usersList = usersService.findAll();
        return new ResponseEntity<Iterable<Users>>(usersList,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findById/{userId}") //URL
    public ResponseEntity<?> findById(@PathVariable("userId") String userId){ //ResponseEntity specifies the type of object to return as a response

        Users users=usersService.findOne(userId);
        UsersDTO usersDTO=new UsersDTO();

        if(users==null){
            return new ResponseEntity<String>("No record found", HttpStatus.OK); //response is a String type
        }
        BeanUtils.copyProperties(users,usersDTO);
        return new ResponseEntity<UsersDTO>(usersDTO,HttpStatus.OK); //response is an object of EmployeeDto
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(method = RequestMethod.POST,value = "/signup")
    public ResponseEntity<String> signup(@RequestBody UsersDTO usersDTO) //RequestBody maps the HttpRequest body to an object, auto deserialization
    {
        Users user=new Users();
        BeanUtils.copyProperties(usersDTO,user);
        Users user1 = usersService.findByUserName(usersDTO.getUserName());
        Users users = new Users();
        if(user1==null){
            BeanUtils.copyProperties(usersDTO,users);
            Users userscreated = usersService.save(users);

            return new ResponseEntity<>("Congratulations "+userscreated.getUserName()+" Happy Shopping",HttpStatus.OK);
        }else{

                return new ResponseEntity<>("username with same name already created!!!", HttpStatus.OK);
        }

    }

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public ResponseEntity<?> login(@RequestBody UsersDTO usersDTO){
        Users user=new Users();
        BeanUtils.copyProperties(usersDTO,user);
        Users user1 = usersService.findByUserName(usersDTO.getUserName());

        if(user1==null){
            return new ResponseEntity<String>("please enter valid username", HttpStatus.OK); //response is a String type
        }else{
            if(user1.getPassword().equals(usersDTO.getPassword())){
                return new ResponseEntity<>("ok",HttpStatus.OK);
            }else{
                return new ResponseEntity<>("wrong credentials!!!", HttpStatus.OK);
            }

        }
//        return new ResponseEntity<List<Employee>>(employeeList,HttpStatus.OK);
    }
}
