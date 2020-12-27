package com.malyszdan.services;

import com.malyszdan.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(Long id);
}
