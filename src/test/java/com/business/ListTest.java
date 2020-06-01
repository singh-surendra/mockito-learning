package com.business;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListSizeMethod() {

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        Assert.assertEquals(2, listMock.size());

    }

    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues() {

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        //first time it return 2
        // second time, it returns 3
        Assert.assertEquals(2, listMock.size());
        Assert.assertEquals(3, listMock.size());

    }

    @Test
    public void letsMockListGet() {

        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Hello Suri");

        //first time it return 2
        // second time, it returns 3
        Assert.assertEquals("Hello Suri", listMock.get(0));
        Assert.assertEquals(null, listMock.get(1));

    }

    @Test
    public void letsMockListGet_WithArgumentMatcher() {

        List listMock = mock(List.class);
        //Argument matcher
        when(listMock.get(anyInt())).thenReturn("Hello Suri");

        //first time it return 2
        // second time, it returns 3
        Assert.assertEquals("Hello Suri", listMock.get(0));
        Assert.assertEquals("Hello Suri", listMock.get(1));

    }

    @Test(expected = RuntimeException.class)
    public void letsMockList_throwAnException() {

        List listMock = mock(List.class);
        //Argument matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("something"));
        listMock.get(0);
    }
}
