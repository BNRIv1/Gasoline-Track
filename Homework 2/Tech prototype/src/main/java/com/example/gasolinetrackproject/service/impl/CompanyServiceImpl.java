package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.Company;

import com.example.gasolinetrackproject.repository.impl.InMemoryCompanyRepository;
//import com.example.gasolinetrackproject.repository.jpa.CompanyRepository;
import com.example.gasolinetrackproject.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    //private final CompanyRepository companyRepository;
    private final InMemoryCompanyRepository companyRepository;

    public CompanyServiceImpl(InMemoryCompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> listAll() {
        return companyRepository.findAllCompanies();
    }
}
