# Test project

## Description
This project allows you to get data about people and their cars.

## Guides
Clone the project on your laptop and run it in IDE.

## REST API
### Get a Person by id:
#### Request
`GET /api/person/id`

    curl --location --request GET 'http://localhost:8086/api/person/1'
 
#### Response
    {"id":1,"lastName":"Petrov","cars":[{"id":1,"brand":"CITROEN"}]}

### Get a list of Persons:
#### Request
`GET /api/person/all`

    curl --location --request GET 'http://localhost:8086/api/person/all'
 
#### Response
    [{"id":1,"lastName":"Petrov","cars":[{"id":1,"brand":"CITROEN"}]},{"id":2,"lastName":"Ivanov","cars":[{"id":2,"brand":"HONDA"},{"id":3,"brand":"LADA"}]},{"id":3,"lastName":"Sidorov","cars":[{"id":4,"brand":"VOLVO"}]}]
