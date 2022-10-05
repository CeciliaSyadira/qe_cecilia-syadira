# Resume Materi KMQE

## _(19) RESTful API Testing with Rest Assured_
oleh Cecilia Syadira SIB-3 QA Class A

API (Application Programming Interface) yaitu cara kerja yang memungkinkan dua komponen perangkat lunak saling terhubung.

### Fundamental API Integration
- Mobile App
- API Server
- Ext Process
- API Testing

### Test Process
- Record, Define API Information
- Parsing, Filter or Recording API Data and then extract
- Reconstruction API calls, and sent them from a simualte client
- Test Validation

### The Practical Test Pyramid
**Unit**, Test the smallest testable part of an application through methods

**Component**. Test a specific modules or sub-system through the API

**Integration**, Test the interactions between two modules or Sub-system through API contract

**UI**, (End to end) Test the interaction between the overall through the user interface

### Rest Assured
- Supports for HTTP methods
- Supports for BDD/Gherkin (Given, When, Then)
- Use of Hamcrest matches for checkes (equalTo)
- User of Gpath for selecting element from JSON response

### Writing the Test
- Rest Assured
- .given()... >> Test Setup
- .when()... >> Test Action
- .then()... >> Test Verification


