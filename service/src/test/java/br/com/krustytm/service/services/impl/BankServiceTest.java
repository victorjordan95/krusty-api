package br.com.krustytm.service.services.impl;

import br.com.krustytm.model.entity.Bank;
import br.com.krustytm.model.repository.BankRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BankServiceTest {

    @Mock
    private BankRepository repository;

    private Bank mock;
    private List<Bank> mocks;

    @Before
    public void setup() {
        mocks = new ArrayList<>();
        mocks.add(new Bank(2, "code_1", "name_1", null));
        mocks.add(new Bank(3, "code_2", "name_2", null));
        mocks.add(new Bank(4, "code_3", "name_3", null));

        Iterable<Bank> iterableMock = mocks;
        when(repository.findAll()).thenReturn(iterableMock);
    }

    @Test
    public void shouldFindById() {
        mock = new Bank();
        mock.setId(1);
        mock.setCode("1234");
        mock.setName("Teste");

        when(repository.findOne(anyInt())).thenReturn(mock);

        Bank actual = repository.findOne(100);
        assertEquals(1, actual.getId(), 000.1);
    }

    @Test
    public void shouldFindAll() {
        Iterable<Bank> actuals = repository.findAll();
        int i = 2;
        for (Bank b : actuals) {
            assertEquals(i, b.getId(), 000.1);
            i++;
        }
    }
}
