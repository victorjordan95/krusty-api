package br.com.krustytm.service.services.impl;

import br.com.krustytm.model.entity.BankDetails;
import br.com.krustytm.model.repository.BankDetailsRepository;
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
public class BankDetailsServiceTest {

    @Mock
    private BankDetailsRepository repository;

    private BankDetails mock;
    private List<BankDetails> mocks;

    @Before
    public void setup() {
        mocks = new ArrayList<>();
        mocks.add(new BankDetails(2, null, "agency_2", "cc_2"));
        mocks.add(new BankDetails(3, null, "agency_3", "cc_3"));
        mocks.add(new BankDetails(4, null, "agency_4", "cc_4"));

        Iterable<BankDetails> iterableMock = mocks;
        when(repository.findAll()).thenReturn(iterableMock);
    }

    @Test
    public void shouldFindById() {
        mock = new BankDetails();
        mock.setId(1);
        mock.setAgency("agency");
        mock.setAccountNumber("Teste");

        when(repository.findOne(anyInt())).thenReturn(mock);

        BankDetails actual = repository.findOne(100);
        assertEquals(1, actual.getId(), 000.1);
    }

    @Test
    public void shouldFindAll() {
        Iterable<BankDetails> actuals = repository.findAll();
        int i = 2;
        for (BankDetails b : actuals) {
            assertEquals(i, b.getId(), 000.1);
            i++;
        }
    }
}
