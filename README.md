#iRestaurant

1. What is the proposed name for your Web application?

iRestaurant, an online restaurant that provides different food from different cuisine.

2. Who is the target audience?

The restaurant is intended to target those who have no time (or busy)  to get a decent meal without going to a restaurant by giving them a meal from a variety of different choices from different cuisine. 

3. What problem is it intended to solve for the target audience?

Anyone who is busy, for example, students, an employee who has abundant tasks that have to be finished, so they have no time to prepare a delicious meal. Furthermore, it is not easy to get a diversity of choices from just one restaurant. Therefore, this project, iRestaurant, will provide a friendly website for those people as an option to taste different dishes from different cuisines.   

4. How will it meet the minimum project requirements?

All customer will be able to create an account on the restaurant’s website, and then they can order a new order or repeat their past orders. Moreover, the restaurant site will enable the customers to review a meal, rated, and post meal’s picture. Finally, if the user wishes to delete his/her account, the restaurant site will provide the required procedure to do so.


5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?


Since the most of the online restaurants in the market are based on connecting other restaurants with the customer without providing fancy details for the meals and enable the customers to write reviews or rated, this restaurant, iRestaurant will be more interactive. So the reason why I want to make it a restaurant, not just connecting other restaurants without having the ability to order (so it is a restaurant), is that I want the customers to interact with each other and they can through that have adequate details for every meal.
 


## Build status




[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-aaabuabat.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-aaabuabat)

## Changelog

[Changelog](CHANGELOG.md)


## Web Site

[iRestaurant](https://safe-woodland-35812.herokuapp.com/)

![](https://s.gravatar.com/avatar/38959e012175f9594b4628cef77ea6c9?s=80.png)

## Key Features

Please list key features of your project.

* The user is able to add a recipes.
* The user is able to dispaly a recipes.
* The user is able to dispaly a recipes.
* A particular recipe could be deleted by its ID.
* A particular recipe could be updated by its ID.
* The user is able to upload a picture for a recipe.
* All recipes can be retrieved through the api as a JSON format.


## Project Details

### Landing Page

Simple Landing Page with a link to the login Page.![](https://i.imgur.com/jsoolY7.jpg)

### User Input Form

This page will enable the user to enter the recpie that he has.![](https://imgur.com/3MhMvjj.jpg)

## API

### API Method 1

    GET /public/api/irestaurant/:id

#### Parameters

- **id** _(required)_ — The Dish ID to grap its data.

#### Response

A JSON containing the DishID and its data.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The dish was not found.

#### Example

##### Request

    GET /public/api/irestaurant/2


##### JSON Response

```json
{
   "id":1,
   "title":"Biryani",
   "cuisineType":"Indian",
   "mealTime":"Dinner",
   "mealType":"Main_Course",
   "description":"Rice + Meat",
   "kitchenKit":[{"id":1,"text":"Pot"},{"id":2,"text":"Spons"},{"id":3,"text":"Knives"}],
   "ingredients":[{"id":1,"value":"1 1/2","unit":"Tablespoon","text":"Salt"},{"id":2,"value":"1","unit":"Pound","text":"Rice"},{"id":3,"value":"2","unit":"Tablespoon","text":"chopped fresh parsle"},{"id":4,"value":"2","unit":"Pound","text":"Meat"},{"id":5,"value":"1","unit":"Tablespoon","text":"Oil"}],
   "directions":[{"id":1,"text":"Preheat oven broiler"},{"id":2,"text":"Mix items together"},{"id":3,"text":"chopped fresh parsle"}]
}
```


## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.