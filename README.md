# An API Implementation for POST, GET and DELETE for a Farmer Portal

The input fields are:
```
String name
String phone_number
email
LocalDate date_of_birth
String gender
String state
String district
String village
Integer pin_code
String address
String civil_status
LocalDate registration_date
String education_level
String employment_status
String hh_income_type
Integer total_land_area
String ownership_type
String land_certificate
Integer land_id
String primary_crop
String collected_gc
String season
String secondary_crop
String livestock_type
String livestock_count
```

A mock set of data for the input fields can be found under src/test/java/com/mosip/farmer_registration/test.json

The endpoint for POST request is /api/farmer/registration
The endpoint for GET and DELETE request is /api/farmer/registration/{id}

## Setup

Run the command ``` docker-compose up ``` to set up Postgres Database

Then in another terminal run ``` ./mvnw spring-boot:run ```

The setup is done

Requests can be made throught Postman or any other method of your preference
