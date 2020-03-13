package com.zoo;

import com.zoo.exception.NoFoodException;

public interface FeedAnimal {
     void eat(int portion, String food) throws NoFoodException;

}
