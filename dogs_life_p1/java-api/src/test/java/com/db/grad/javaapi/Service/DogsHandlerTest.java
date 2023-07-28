package com.db.grad.javaapi.Service;

import org.junit.jupiter.api.BeforeEach;

public class DogsHandlerTest
{
    private DogsRepository itsDogRepo = new DogsRepositoryStub();
    @BeforeEach
    public void makeSureRepoIsEmpty(){
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){
        DogHandler cut = new DogHandler();

    }
}
