package com.business;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//What is mocking?
//Mocking is create objects that simulate the behaviour of real objects
//Unlike stubs, mocks can be dynamically created from code - at runtime
//Mocks offer more functionality than stubbing
//You can verify method calls and a lot of other things




public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock() {
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        Assert.assertEquals(2,filteredTodos.size());

    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEptyList() {
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        Assert.assertEquals(0,filteredTodos.size());

    }
}
