package com.example.hillel.hw25;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static com.example.hillel.hw25.BaseUrl.BASE_URL;
import static com.example.hillel.hw25.EndPoint.FIND_PET_BY_ID;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PetsTests {


  @Test
  public void testGetAvailablePets() {
    RestAssured.baseURI = BASE_URL;
    given()
        .queryParam("status", "available")
        .when().get(EndPoint.FIND_PETS_BY_STATUS)
        .then()
        .statusCode(200)
        .body("id", notNullValue())
        .body("category.id", notNullValue())
        .body("category.name", notNullValue());
  }

  @Test
  public void testGetPendingPets() {
    RestAssured.baseURI = BASE_URL;
    given()
        .queryParam("status", "pending")
        .when().get(EndPoint.FIND_PETS_BY_STATUS)
        .then()
        .statusCode(200)
        .body("id", notNullValue())
        .body("category.id", notNullValue())
        .body("category.name", notNullValue());

  }

  @Test
  public void testGetSoldPets() {
    RestAssured.baseURI = BASE_URL;
    given()
        .queryParam("status", "sold")
        .when().get(EndPoint.FIND_PETS_BY_STATUS)
        .then()
        .statusCode(200)
        .body("id", notNullValue())
        .body("category.id", notNullValue())
        .body("category.name", notNullValue());

  }

  @Test
  public void testGetPetById() {
    final String PET_ID = "799";
    given()
        .contentType(ContentType.JSON)
        .when()
        .get(BASE_URL + FIND_PET_BY_ID, PET_ID)
        .then()
        .statusCode(200)
        .assertThat()
        .body("id", equalTo(Integer.valueOf(PET_ID)))
        .body("name", notNullValue())
        .body("category.id", notNullValue())
        .body("category.name", notNullValue())
        .body("photoUrls[0]", notNullValue())
        .body("tags", notNullValue())
        .body("status", equalTo("available"));
  }

  @Test
  public void testPostPetNameUpdate() {
    String petId = "799";
    String newName = "Vovk";

    given()
        .contentType(ContentType.URLENC)
        .formParam("name", newName)
        .when()
        .post(BASE_URL + EndPoint.UPDATE_PET_BY_ID.replace("{petId}", petId))
        .then()
        .statusCode(200)
        .assertThat()
        .body("code", equalTo(200))
        .body("type", equalTo("unknown"))
        .body("message", equalTo(petId));
  }

  @Test
  public void testPostPetStatusUpdate() {
    String petId = "799";
    String Status = "available";

    given()
        .contentType(ContentType.URLENC)
        .formParam("name", Status)
        .when()
        .post(BASE_URL + EndPoint.UPDATE_PET_BY_ID.replace("{petId}", petId))
        .then()
        .statusCode(200)
        .assertThat()
        .body("code", equalTo(200))
        .body("type", equalTo("unknown"))
        .body("message", equalTo(petId));
  }

  @Test
  public void testGetNonExistentPetById() {
    final String NON_EXISTENT_PET_ID = "444444444444";
    given()
        .contentType(ContentType.JSON)
        .when()
        .get(BASE_URL + "/pet/{petId}", NON_EXISTENT_PET_ID)
        .then()
        .statusCode(404);
  }

}
