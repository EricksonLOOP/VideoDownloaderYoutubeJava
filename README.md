<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - YouTube Video Downloader</title>
</head>
<body>

<h1>YouTube Video Downloader</h1>

<p>Este projeto é um <strong>baixador de vídeos do YouTube</strong> feito em <strong>Java</strong> utilizando a biblioteca <a href="https://github.com/sealedtx/java-youtube-downloader" target="_blank">java-youtube-downloader</a>. Ele permite que você faça download de vídeos diretamente do YouTube de forma prática e simples.</p>

<h2>🚀 Funcionalidades</h2>
<ul>
    <li>Baixar vídeos do YouTube com áudio</li>
    <li>Salvar vídeos em diretórios específicos com renomeação automática</li>
</ul>

<h2>🛠 Tecnologias Utilizadas</h2>
<ul>
    <li><strong>Java 17+</strong></li>
    <li><strong>Maven</strong> para gerenciamento de dependências</li>
    <li><a href="https://github.com/sealedtx/java-youtube-downloader" target="_blank">java-youtube-downloader</a> (biblioteca para acessar vídeos do YouTube)</li>
</ul>

<h2>📦 Pré-requisitos</h2>
<ul>
    <li><strong>Java 17+</strong> instalado</li>
    <li><strong>Maven</strong> instalado para gerenciar as dependências</li>
</ul>

<h2>📥 Como Configurar o Projeto</h2>

<h3>1. Clone o repositório</h3>
<pre><code>git clone https://github.com/SEU_USUARIO/YouTubeVideoDownloader.git
cd YouTubeVideoDownloader
</code></pre>

<h3>2. Instale as dependências</h3>
<p>Execute o Maven para baixar todas as dependências:</p>
<pre><code>mvn clean install</code></pre>

<h3>3. Modifique o ID do vídeo</h3>
<p>No arquivo <code>Main.java</code>, modifique a variável <code>request</code> para incluir o <strong>ID</strong> do vídeo que você deseja baixar. O ID do vídeo é a sequência de caracteres que aparece na URL do YouTube após o parâmetro <code>?v=</code>, por exemplo:</p>
<pre><code>RequestVideoInfo request = new RequestVideoInfo("ID_DO_VIDEO_AQUI");</code></pre>

<h3>4. Compile e execute o projeto</h3>
<p>Utilize o Maven para compilar e rodar o projeto:</p>
<pre><code>mvn compile exec:java -Dexec.mainClass="org.edev.Main"</code></pre>

<h2>📂 Estrutura do Projeto</h2>
<pre><code>.
├── src
│   └── main
│       └── java
│           └── org
│               └── edev
│                   └── Main.java   # Código principal do baixador de vídeos
├── pom.xml  # Arquivo de configuração do Maven
└── README.md
</code></pre>

<h2>📜 Exemplo de Uso</h2>
<p>O programa irá baixar o vídeo especificado pelo ID, mostrar o nome do vídeo no console e salvá-lo no diretório <code>my_videos</code> com o nome <code>videoYT.mp4</code>.</p>
<ol>
    <li>Modifique o ID do vídeo no código.</li>
    <li>Execute o projeto com o Maven.</li>
    <li>O vídeo será baixado e salvo no diretório <code>my_videos</code>.</li>
</ol>

<h2>⚠️ Aviso Legal</h2>
<p>Este projeto é para fins educacionais. Respeite os direitos autorais e siga as diretrizes do YouTube ao baixar vídeos.</p>

<h2>📝 Licença</h2>
<p>Este projeto está licenciado sob a licença MIT. Consulte o arquivo <a href="LICENSE">LICENSE</a> para mais detalhes.</p>

</body>
</html>
