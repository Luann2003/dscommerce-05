# Projeto Dscommerce-05
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Luann2003/dscommerce-05/blob/main/LICENSE) 

## Sobre o projeto
O Sistema dscommerce-05 é uma aplicação web que simplifica o processo de gerenciamento de pedidos e produtos para empresas. Com recursos avançados de autenticação, permite que os administradores controlem facilmente o acesso aos dados e ações críticas. Os clientes podem visualizar produtos e fazer pedidos de forma rápida e eficiente, enquanto os administradores têm controle total sobre o estoque, pedidos e categorias de produtos.

Este projeto foi desenvolvido como parte dos meus estudos no programa Dev Superior, um programa intensivo de desenvolvimento back-end.

**Principais Funcionalidades**:
- Autenticação segura com geração de token de acesso
- Listagem de produtos com detalhes e categorias
- Gerenciamento de pedidos, incluindo criação e visualização
- Controle de acesso com funções de usuário ADMIN e CLIENTE
- Listagem de categorias de produtos
```bash
# Clone o repositório
git clone https://github.com/Luann2003/dscommerce-05.git

# Navegue até o diretório do projeto
cd dscommerce-05

# Compile e execute o programa
java main.java
```


## Login
O processo de login no nosso aplicativo envolve os seguintes passos:

1. Quando um usuário tenta fazer login, eles enviam uma solicitação POSTMAN com suas credenciais (nome de usuário e senha) no corpo da solicitação.

2. O servidor processa a solicitação e verifica as credenciais do usuário. Se as credenciais estiverem corretas, o servidor gera um token de acesso.

3. O token de acesso é então retornado como parte da resposta da solicitação de login. Esse token é usado para autenticar o usuário em solicitações subsequentes.

4. Para acessar recursos protegidos, o usuário deve incluir o token de acesso no cabeçalho `Authorization` de suas solicitações. O formato do cabeçalho é `Bearer SEU_TOKEN_DE_ACESSO`.
   
![](https://github.com/Luann2003/dscommerce-05/blob/main/Login.png)


## Endpoint `/me` - Informações do Usuário Logado

O endpoint `/me` é projetado para retornar as informações do usuário atualmente logado. Esse recurso é útil quando um usuário já está autenticado e deseja acessar seus próprios detalhes de perfil ou informações pessoais.

![](https://github.com/Luann2003/dscommerce-05/blob/main/info%20.png)


## Proteção de Recursos e Tratamento de Erros

Nosso aplicativo protege determinados recursos e funcionalidades, exigindo que os usuários estejam autenticados para acessá-los. Se um usuário não autenticado tentar acessar um recurso protegido ou executar uma função que requer autenticação, o servidor responderá com um código de erro 401 (Unauthorized).

Além disso, se um usuário autenticado, mas sem as permissões adequadas, tentar acessar um recurso restrito apenas para administradores, o servidor responderá com um código de erro 403 (Forbidden).

Isso significa que o acesso não é permitido sem autenticação adequada ou permissões apropriadas. Os usuários devem fazer login e obter um token de acesso válido, e os administradores devem ter as devidas permissões para acessar recursos restritos.


 | ![Erro 401](https://github.com/Luann2003/dscommerce-05/blob/main/restri%C3%A7%C3%A3o.jpg) | ![Erro 403](https://github.com/Luann2003/dscommerce-05/blob/main/403.png) |
   | ------------------------------------------------ | -------------------------------------------------------------- |
   

## Conclusão

Este projeto marca a conclusão do curso Java Spring Professional do "Dev Superior", um curso abrangente de desenvolvimento backend com Spring Boot. Durante o curso, adquiri uma ampla variedade de conhecimentos e habilidades, incluindo:

- Componentes e Injeção de Dependência
- Estruturação de projeto em camadas
- Modelagem de Domínio e Relacionamentos
- Mapeamento Objeto-Relacional com Hibernate
- Desenvolvimento de APIs RESTful
- Tratamento de Exceções e Validação de Dados
- Consultas ao Banco de Dados e Gerenciamento de Transações
- Implementação de Autenticação e Controle de Acesso
- Uso de OAuth2 e JWT para segurança
- Configuração de Variáveis de Ambiente e Perfis de Projeto
- Implantação em Ambientes Locais e de Homologação

O curso, com um total de 120 horas de aprendizado, proporcionou uma base sólida para desenvolvimento backend, capacitando-me a criar aplicativos web robustos e seguros com o Spring Boot.

A obtenção do certificado deste curso representa um marco significativo na minha jornada de aprendizado e desenvolvimento como desenvolvedor backend. Estou ansioso para aplicar essas habilidades em projetos futuros e continuar a aprimorar meu conhecimento.

# Autor
Luan Victor de Ramos Luciano

https://www.linkedin.com/in/luan-luciano-1603b4197/

