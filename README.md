<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Projeto iPhone</title>
</head>
<body>

<h1 align="center">Projeto iPhone - Implementação dos Papéis do iPhone</h1>

<p align="center">
    Este projeto em Java representa o iPhone assumindo três papéis principais: <strong>Reprodutor Musical</strong>, <strong>Aparelho Telefônico</strong> e <strong>Navegador de Internet</strong>. As funcionalidades implementadas demonstram o uso de conceitos da Programação Orientada a Objetos (POO) como Abstração, Encapsulamento, Herança e Polimorfismo.
</p>

<h2>📁 Estrutura do Projeto</h2>
<pre>
ProjetoiPhone/
├── src/
│   ├── ReprodutorMusical.java    - Interface para funções de reprodução de música
│   ├── AparelhoTelefonico.java    - Interface para funções de chamadas telefônicas
│   ├── NavegadorInternet.java     - Interface para funções de navegação na internet
│   └── iPhone.java                - Classe que implementa todas as interfaces
</pre>

<h2>🚀 Funcionalidades</h2>
<ul>
    <li>Funções de <strong>reprodução musical</strong> incluindo tocar, pausar e selecionar música</li>
    <li>Funções de <strong>chamadas telefônicas</strong> incluindo ligar, atender e iniciar conferência</li>
    <li>Funções de <strong>navegação de internet</strong> incluindo abrir páginas, atualizar e exibir histórico</li>
</ul>

<h2>🛠️ Tecnologias Utilizadas</h2>
<ul>
    <li>Java SE (Standard Edition)</li>
</ul>

<h2>📦 Instalação e Execução</h2>
<ol>
    <li>Clone o repositório em sua máquina local:
        <pre><code>git clone https://github.com/seu-usuario/projeto-iphone.git</code></pre>
    </li>
    <li>Compile os arquivos:
        <pre><code>cd ProjetoiPhone/src
javac *.java</code></pre>
    </li>
    <li>Execute a aplicação:
        <pre><code>java iPhone</code></pre>
    </li>
</ol>

<h2>📂 Estrutura das Interfaces e Classe</h2>

<h3>ReprodutorMusical (Interface)</h3>
<p>A interface <strong>ReprodutorMusical</strong> define os métodos necessários para reprodução de música:</p>
<ul>
    <li><code>tocar()</code> - Inicia a reprodução da música atual</li>
    <li><code>pausar()</code> - Pausa a música em reprodução</li>
    <li><code>selecionarMusica(String musica)</code> - Seleciona uma música para reprodução</li>
</ul>

<h3>AparelhoTelefonico (Interface)</h3>
<p>A interface <strong>AparelhoTelefonico</strong> define os métodos necessários para funções de telefonia:</p>
<ul>
    <li><code>ligar(String numero)</code> - Realiza uma chamada para o número especificado</li>
    <li><code>atender()</code> - Atende uma chamada recebida</li>
    <li><code>iniciarConferencia(String[] numeros)</code> - Inicia uma chamada de conferência</li>
</ul>

<h3>NavegadorInternet (Interface)</h3>
<p>A interface <strong>NavegadorInternet</strong> define os métodos necessários para navegação na internet:</p>
<ul>
    <li><code>abrirPagina(String url)</code> - Abre uma página na URL especificada</li>
    <li><code>atualizarPagina()</code> - Atualiza a página atual</li>
    <li><code>exibirHistorico()</code> - Exibe o histórico de navegação</li>
</ul>

<h3>iPhone (Classe)</h3>
<p>A classe <strong>iPhone</strong> implementa as três interfaces e representa as funcionalidades do iPhone nos papéis de reprodutor musical, aparelho telefônico e navegador de internet. Os métodos são implementados conforme especificações das interfaces.</p>

<h2>🔄 Exemplo de Uso</h2>
<p>Após compilar e executar o programa, você pode simular as funcionalidades do iPhone:</p>
<pre><code>
iPhone iphone = new iPhone();

// Funções de Reprodutor Musical
iphone.selecionarMusica("Música A");
iphone.tocar();
iphone.pausar();

// Funções de Aparelho Telefônico
iphone.ligar("123-456");
iphone.atender();
iphone.iniciarConferencia(new String[]{"123-456", "789-101"});

// Funções de Navegador de Internet
iphone.abrirPagina("https://exemplo.com");
iphone.atualizarPagina();
iphone.exibirHistorico();
</code></pre>

<h2>📄 Licença</h2>
<p>Este projeto é de código aberto e está disponível sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.</p>

<h2>👤 Autor</h2>
<p>Desenvolvido por <strong>Michael Bullet</strong> - <a href="https://github.com/BulletDEV">GitHub</a></p>

</body>
</html>
