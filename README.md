# Conventional2

## Context

**Domain of Application:** Product rating management.

### Structure

![Structure](/docs/structure.png)

<sub>*_(Image obtained via NetBeans just for explanation. Don't worry if you're using another IDE)_</sub>

There are 3 packages: **controller**, **dao**, and **model**.
- In the **controller** package, there is the **Conventional2** class. This is the controller class for business logic methods.
- In the **dao** package are the classes **ProductDAO** and **RatingDAO**. These are interfaces that are used by the QueryBuilder to generate queries to the databases.
- In the **model** package, there are the **Product** and **Rating** classes. 

There is 1 test package: **tests**.
- In the **tests** package, there are the classes **Conventional2Test** and **IntegrationTest**, responsible for unit and integration tests.

### Products

In the context of this example, products considers everything that is sold in physical or virtual supermarkets. Example for product names: NuttyCream, KingPotatoes, TofuPrime, etc. Below is a view of the products table with a small number of tuples for illustration.

![Table](/docs/table.png)

The class **model.Product** maps the **product** table from the **experiment** database stored in PostgreSQL using JPA.

The attributes of the table are intuitive.
- name: product's name
- description: full description of the product
- price: product's price
- weight: weight (grams) of the product
- brand: brand of the product
- segment: segment of product, e.g., bakery, frozen foods, snacks, etc.
- type: type of product, e.g., bread, eggs, butter, etc.

<sub>*_(The data used in this experiment were generated randomly. Although inspired by real data, they do not reflect accurate information. It is for experimental purposes only.)_</sub>

### Ratings

In the context of this example, ratings reports record information about product evaluation scores. Example, rating in a scale of 1 to 5, with 1 indicating very unsatisfactory and 5 indicating exceptional. Below is a view of the rating collection with a small number of documents for illustration.

![Collection](/docs/collection.png)

The class **model.Rating** maps the **rating** collection from the **experiment** database stored in MongoDB using Morphia ODM.

The properties of the collection are intuitive.
- product: name of the evaluated product
- comment: comment about the product.
- value: rating value. the rating is on a scale of 1 to 5, with 1 indicating very unsatisfactory and 5 indicating exceptional.
- source: origin of rating, e.g, app, site.

<sub>*_(The data used in this experiment were generated randomly. Although inspired by real data, they do not reflect accurate information. It is for experimental purposes only.)_</sub>

## Task

🎯 **Count the number of ratings equal to 5 for all products of a given brand.**

### Steps

**1.** Download the project source code and open it with your preferred IDE. If prompt grant remote access to the Java process and/or your IDE.
⏬ [Download here!](https://codeload.github.com/PolyglotExperiment/Conventional2/zip/refs/heads/main) or `git clone https://github.com/PolyglotExperiment/Conventional2.git`

**2.** Run the tests for the project. You must have **3** failed tests. The failing tests are related to the method **countRatingEqual5ByBrand(String brand)** in the class **controller.Conventional2**.

![Tests](/docs/tests.png)

**3.** Once you're ready to start, **⏰⏰⏰ NOTE THE START TIME ⏰⏰⏰**.
- To ensure the tests pass, 🎯 **you must appropriately implement the countRatingEqual5ByBrand(String brand) method, using the simple (typical solution)** with independent DAOs.
- All packages and classes allow you to modify their code. However, prevent modifying any of the current tests.

**4.** **⏰⏰⏰ NOTE THE END TIME ⏰⏰⏰**.

**5.** Please send email the whole project code (Conventional2) as a _zip_, _tar.gz_, or _7z_ file to **fernando.opc@gmail.com**. To prevent attachment issues on some email servers, run `mvn clean` or manually delete the `target` folder.
  
> [!WARNING]
> Do not alter any of the existing tests.
> 
> Don't forget to **NOTE the START and END times** of your coding.

> [!TIP]
> If necessary, refer to the example in [Polyglot Experiment C1.1](https://github.com/PolyglotExperiment#c11-simple-typical-solution) for a simple (typical solution).
