package com.sujit.ecommerce.Library.service;

import com.sujit.ecommerce.Library.dto.AdminDto;
import com.sujit.ecommerce.Library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
