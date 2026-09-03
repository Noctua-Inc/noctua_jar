# 🚀 Executando o JAR no Terminal

Passo a Passo para Executar o JAR

    Abra o terminal: No sistema operacional que você estiver usando (Windows, macOS ou Linux), abra o terminal ou prompt de comando.
    Navegue até o diretório: Vá até o diretório onde o arquivo .jar foi gerado. Se você seguiu o tutorial, o JAR deve estar na pasta target do seu projeto. Use o comando cd para navegar até essa pasta. Exemplo:

    cd caminho/para/o/projeto/target

    Execute o JAR: Agora que você está no diretório correto, execute o JAR utilizando o seguinte comando:

    java -jar nome_do_arquivo.jar

    Substitua nome_do_arquivo.jar pelo nome do JAR gerado. Por exemplo, se o nome do seu arquivo for exemplo-java-lambda-1.0-SNAPSHOT.jar, o comando seria:

    java -jar exemplo-java-lambda-1.0-SNAPSHOT.jar   


# Requisitos para Executar o JAR

Para que o comando java -jar funcione, é necessário que o Java Runtime Environment (JRE) esteja instalado na sua máquina. A JRE é o ambiente que permite rodar aplicações Java e inclui a máquina virtual Java (JVM), responsável por executar o código Java.

Além disso, o JRE precisa estar configurado nas variáveis de ambiente do sistema operacional. Isso significa que o comando java deve ser reconhecido em qualquer diretório da sua máquina. Se isso não estiver configurado corretamente, ao tentar executar o JAR, você verá uma mensagem de erro indicando que o comando java não foi encontrado.

Se você ainda não tem a JRE instalada ou configurada, siga as instruções do site oficial do Java para baixar e instalar a versão mais recente.
