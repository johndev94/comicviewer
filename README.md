![image](https://github.com/user-attachments/assets/1d705d35-7764-4936-9606-0c9173bcc94f)

<h1>Comic Viewer Application</h1>

  <p><strong>Comic Viewer Application</strong> is a sleek, user-friendly platform designed for comic book fans to easily explore and enjoy a wide range of comics.</p>

  <h2>Features</h2>
  <ul>
    <li><strong>Search Comics by Title</strong>: Quickly find your favorite comics by simply typing in the title.</li>
    <li><strong>Genre Filtering</strong>: Use the dropdown menu to filter comics by genre, making it easy to discover new titles based on your interests.</li>
    <li><strong>Detailed Comic Information</strong>: Each comic entry displays essential details like title, author, genre, rating, and a cover image.</li>
    <li><strong>Mobile and Desktop Friendly</strong>: The app is built with responsive design, ensuring a smooth experience whether you're on a computer or a mobile device.</li>
  </ul>

  <h2>Technologies Used</h2>
  <ul>
    <li><strong>Spring Boot</strong>: For creating RESTful API endpoints.</li>
    <li><strong>MySQL</strong>: For storing and managing comic data.</li>
    <li><strong>Thymeleaf</strong>: For rendering HTML views with dynamic content.</li>
    <li><strong>Bootstrap</strong>: For creating a responsive and visually appealing user interface.</li>
  </ul>

  <h2>Installation</h2>
  <ol>
    <li><strong>Clone the repository</strong>:
      <pre><code>[git clone https://github.com/johndev94/comicviewer.git</code></pre>
    </li>
    <li><strong>Navigate to the project directory</strong>:
      <pre><code>cd comicviewer</code></pre>
    </li>
    <li><strong>Configure the database</strong>:
      <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/comicsdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
      </code></pre>
    </li>
    <li><strong>Run the application</strong>:
      <pre><code>mvn spring-boot:run</code></pre>
    </li>
  </ol>

  <h2>Usage</h2>
  <ul>
    <li><strong>Access the application</strong>: Open your web browser and go to <code>http://localhost:8080</code>.</li>
    <li><strong>Search for Comics</strong>: Use the search bar to find comics by title.</li>
    <li><strong>Filter by Genre</strong>: Use the dropdown menu to filter comics by genre.</li>
  </ul>

  <h2>Example Code</h2>
  <h3>REST API Endpoint</h3>
  <pre><code>@GetMapping("/comics")
public String getComicsPage(Model model) {
    model.addAttribute("comics", comicService.findAll());
    return "comics";
}
  </code></pre>

  <h3>Thymeleaf Template</h3>
  <pre><code>&lt;ul class="list-group"&gt;
  &lt;li class="list-group-item" th:each="comic : ${comics}"&gt;
    &lt;h2 th:text="${comic.title}"&gt;Comic Title&lt;/h2&gt;
    &lt;p&gt;Author: &lt;span th:text="${comic.author}"&gt;&lt;/span&gt;&lt;/p&gt;
    &lt;p&gt;Genre: &lt;span th:text="${comic.genre}"&gt;&lt;/span&gt;&lt;/p&gt;
    &lt;p&gt;Rating: &lt;span th:text="${comic.rating}"&gt;&lt;/span&gt;&lt;/p&gt;
    &lt;img th:src="${comic.image}" alt="Comic Cover" class="img-fluid"&gt;
  &lt;/li&gt;
&lt;/ul&gt;
  </code></pre>

  <h3>Bootstrap Styling</h3>
  <pre><code>&lt;div class="input-group mb-3"&gt;
  &lt;input type="search" class="form-control" placeholder="Search for comics" aria-label="Search"&gt;
  &lt;button class="btn btn-primary" type="button"&gt;Search&lt;/button&gt;
&lt;/div&gt;
  </code></pre>
