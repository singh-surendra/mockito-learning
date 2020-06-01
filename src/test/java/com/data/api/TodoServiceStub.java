package com.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
   //Stub issues : hard coded class and methods
    //dynamic condition
    //Service definition

    public List<String> retrieveTodos(String user) {

        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    }
}
