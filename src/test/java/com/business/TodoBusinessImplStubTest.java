package com.business;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        Assert.assertEquals(2,filteredTodos.size());

    }
}
