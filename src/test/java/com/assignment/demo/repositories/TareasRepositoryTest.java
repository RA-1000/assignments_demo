///**
// * 
// */
//package com.assignment.demo.repositories;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;
//
//import com.assignment.demo.beans.Assignment;
//import com.assignment.demo.repositories.dao.TareasHelper;
//
///**
// * @author dgaram
// *
// */
//@ActiveProfiles("test")
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TareasRepositoryTest {
//
//    @Autowired
//    private TareasRepository repository;
//
//    @Test
//    public void retrieveAllOk() {
//        TareasHelper helper=Mockito.mock(TareasHelper.class);
//        Mockito.when(helper.findAll()).thenReturn(new ArrayList<>());
//        List<Assignment> lista = repository.retrieveAss();
//        Assert.notEmpty(lista, "lista should be empty");
//    }
//
//    @Test
//    public void addAssFailed() {
//        Assignment atest = new Assignment("fail");
//        Mockito.doReturn(null);
//        long id = repository.addAss(null);
//        Assert.isTrue(id == -1L, "id should be a not valid ID");
//    }
//    
//    @Test
//    public void addAssOk() {
//        Assignment atest = new Assignment("ok");
//        atest.setId(1L);
//        Mockito.doReturn(atest);
//        long id = repository.addAss(null);
//        Assert.isTrue(id == atest.getId(), "id should be mocked id");
//    }
//}
