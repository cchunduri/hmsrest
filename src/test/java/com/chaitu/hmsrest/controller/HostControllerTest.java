package com.chaitu.hmsrest.controller;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.models.Host;
import com.chaitu.hmsrest.utils.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by chaitanya.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestEntityManager
public class HostControllerTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private HostDao hostDao;

    @Autowired
    private Helper helper;

    Host host;

    @Before
    public void setUp() throws Exception {
        host = helper.getTempHostDetails();
    }

    @Test
    @Ignore
    public void testFindAllHost() {
        List<Host> rHost = hostDao.findAll();
        assertEquals(host.getHostId(), rHost.get(0).getHostId());
    }

    @After
    public void tearDown() throws Exception {

    }
}