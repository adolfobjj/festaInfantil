# Sistema de Gerenciamento de Eventos
Este é um sistema de gerenciamento de eventos desenvolvido em Java utilizando Spring Boot, Spring Data JPA e Spring Security.

# Funcionalidades
Registro de usuários
Autenticação de usuários
Criação, edição e exclusão de eventos
Lista de eventos com detalhes
Registro de convidados e listas de presentes para cada evento
# Pré-requisitos
Java 17 ou superior instalado
Maven para compilação e empacotamento do projeto
Banco de dados H2
# Como Executar
Clone este repositório em sua máquina local.
Navegue até o diretório do projeto.
Execute o comando mvn spring-boot:run para iniciar o aplicativo.
O aplicativo estará disponível em http://localhost:8080.
# Endpoints da API
/api/users/register - Registro de usuários
/api/login - Autenticação de usuários
/api/events - Operações CRUD para eventos
/api/guests - Operações CRUD para convidados
/api/gift-lists - Operações CRUD para listas de presentes


# Contribuindo
Sinta-se à vontade para abrir problemas (issues) se encontrar algum bug ou tiver alguma sugestão de melhoria.
Pull requests são bem-vindos. Para mudanças importantes, por favor abra um problema primeiro para discutir o que você gostaria de mudar.
