<html>
<body>
<h1>Bem vindo ao nosso GERENCIADOR de empresas!<br/></h1>
${usuarioLogado.email}
<h2>Nova Empresa</h2>
<form action="executa?tarefa=NovaEmpresa" method="POST">
Nome da empresa:<input type="text" name="nome">
<input type="submit" value="Enviar">
</form>
<h2>Login</h2>

<form action="executa?tarefa=Login" method="POST">
Usuário<input type="text" name="email">
Senha<input type="password" name="senha">
<input type="submit" value="login">
</form>
<h2>Logout</h2>
<form action="executa?tarefa=Logout" method="post">
    <input type="submit" value="Logout" />
</form>
</body>
</html>