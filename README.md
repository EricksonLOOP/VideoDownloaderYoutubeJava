<h1>YouTube Video Downloader</h1>

    <p>Este projeto é um <strong>baixador de vídeos do YouTube</strong> utilizando <strong>Java</strong> e a biblioteca <a href="https://github.com/sealedtx/java-youtube-downloader" target="_blank">java-youtube-downloader</a>. O programa permite baixar vídeos diretamente do YouTube, salvando-os em seu computador no formato desejado.</p>

    <h2>🚀 Funcionalidades</h2>
    <ul>
        <li>Baixar vídeos do YouTube em diferentes formatos</li>
        <li>Suporte para baixar vídeos com áudio</li>
        <li>Salvamento dos vídeos em um diretório específico com renomeação automática</li>
    </ul>

    <h2>🛠 Tecnologias Utilizadas</h2>
    <ul>
        <li><strong>Java 17+</strong></li>
        <li><strong>Maven</strong></li>
        <li><a href="https://github.com/sealedtx/java-youtube-downloader" target="_blank"><strong>java-youtube-downloader</strong></a> (biblioteca para acessar vídeos do YouTube)</li>
    </ul>

    <h2>📦 Pré-requisitos</h2>
    <ul>
        <li><strong>Java 17+</strong> instalado</li>
        <li><strong>Maven</strong> instalado para gerenciar dependências</li>
    </ul>

    <h2>📥 Como Configurar o Projeto</h2>

    <h3>1. Clone o repositório</h3>
    <pre><code>git clone https://github.com/SEU_USUARIO/YouTubeVideoDownloader.git
cd YouTubeVideoDownloader
    </code></pre>

    <h3>2. Instale as dependências</h3>
    <p>Execute o Maven para baixar todas as dependências:</p>
    <pre><code>mvn clean install
    </code></pre>

    <h3>3. Modifique o ID do vídeo do YouTube</h3>
    <p>No arquivo <strong>Main.java</strong>, modifique a variável <code>request</code> para incluir o <strong>ID</strong> do vídeo que você deseja baixar. O ID do vídeo é a sequência de caracteres que aparece na URL do YouTube após o parâmetro <code>?v=</code>, por exemplo:</p>

    <pre><code>RequestVideoInfo request = new RequestVideoInfo("ID_DO_VIDEO_AQUI");
    </code></pre>

    <h3>4. Compile e rode o projeto</h3>
    <p>Para compilar e executar o projeto, utilize o Maven com o seguinte comando:</p>
    <pre><code>mvn compile exec:java -Dexec.mainClass="org.edev.Main"
    </code></pre>

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
    <p>O programa irá baixar o vídeo especificado pelo ID do YouTube, exibir o nome do vídeo e salvá-lo no diretório <code>my_videos</code> com o nome <code>videoYT.mp4</code>.</p>

    <ol>
        <li>Após modificar o ID do vídeo no código:</li>
        <li>Execute o projeto.</li>
        <li>O vídeo será baixado e salvo no diretório <code>my_videos</code>.</li>
    </ol>

    <h2>⚠️ Aviso Legal</h2>
    <p>Este projeto é apenas para fins educacionais. Certifique-se de seguir as diretrizes do YouTube e respeitar os direitos autorais ao baixar vídeos.</p>

    <h2>📝 Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT. Consulte o arquivo <a href="LICENSE">LICENSE</a> para mais detalhes.</p>