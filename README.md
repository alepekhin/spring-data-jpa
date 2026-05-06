# spring-data-jpa

## Prerequisits

- Java 25
- java language server
- ollama 0.21.2
- qwen2.5-coder:14b
- nvim 0.13.0 with plugins

```lua
vim.pack.add({
    { src = 'https://github.com/neovim/nvim-lspconfig' },
    { src = 'https://github.com/nvim-tree/nvim-tree.lua' },
    { src = "https://www.github.com/nvim-lua/plenary.nvim" },
    { src = "https://github.com/nvim-treesitter/nvim-treesitter" },
    { src = "https://www.github.com/olimorris/codecompanion.nvim" },
})
```

## How to create project from scratch

- open file 001.md in nvim
- open codecompanion chat `:CodeCompanionChat`
- write #{buffer} <ESC><CR>
- get response:

## CodeCompanion (Ollama)

To create a Maven Java Spring Boot application using the `spring-initializr` command with the specified dependencies, you can use the following command:

```bash
curl https://start.spring.io/starter.zip -d "type=maven-project" -d "language=java" -d "bootVersion=4.0.6" -d "baseDir=spring-data-jpa" -d "groupId=com.example" -d "artifactId=spring-data-jpa" -d "name=spring-data-jpa" -d "description=Demo project for Spring Data JPA" -d "packageName=com.example.springdatajpa" -d "packaging=jar" -d "javaVersion=17" -d "dependencies=jpa,flyway,h2,lombok" -o spring-data-jpa.zip
```

Check it works
```
./mvnw package
```
Then add to context 002.md, 003.md etc
and follow AI advices

When project done, run it as
```
./mvnw spring-boot:run
```
and verify it works with
```
curl http://localhost:8080/users
```


