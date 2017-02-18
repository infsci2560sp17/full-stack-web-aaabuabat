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

TODO : Modify to match your project specific Travis Build


[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-aaabuabat.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-aaabuabat)

## Changelog

[Changelog](CHANGELOG.md)


## Web Site

[iRestaurant](https://safe-woodland-35812.herokuapp.com/)

![](https://s.gravatar.com/avatar/38959e012175f9594b4628cef77ea6c9?s=80.png)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.