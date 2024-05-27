<!-- omit in toc -->

# Contribuindo para FindItNow

Em primeiro lugar, obrigado por dedicar seu tempo para contribuir! ❤️

Todos os tipos de contribuições são incentivadas e valorizadas. Consulte o [índice](#índice) para diferentes maneiras de
ajudar e detalhes sobre como este projeto lida com elas. Por favor, certifique-se de ler a seção relevante antes de
fazer sua contribuição. Isso tornará tudo muito mais fácil para nós, mantenedores, e facilitará a experiência para todos
os envolvidos. A comunidade aguarda suas contribuições. 🎉

> E se você gosta do projeto, mas não tem tempo para contribuir, tudo bem. Existem outras maneiras fáceis de apoiar o
> projeto e mostrar o seu agradecimento, com as quais também ficaríamos muito felizes:
> - Adicionar uma estrela ao projeto
> - Faça um *tweet* sobre isso
> - Referencie este projeto no *README* do seu projeto
> - Mencione o projeto em encontros locais e conte para seus amigos/colegas

<!-- omit in toc -->

## Índice

- [Código de Conduta](#código-de-conduta)
- [Tenho uma pergunta](#tenho-uma-pergunta)
- [Quero contribuir](#quero-contribuir)
    - [Relatando Bugs](#relatando-bugs)
    - [Sugerindo melhorias](#sugerindo-melhorias)
    - [Sua primeira contribuição de código](#sua-primeira-contribuição-de-código)
    - [Melhorando a documentação](#melhorando-a-documentação)
- [Guias de estilo](#guias-de-estilo)
    - [Mensagens de *commit*](#mensagens-de-commit)
- [Junte-se à equipe do projeto](#junte-se-à-equipe)

## Código de Conduta

Este projeto e todos os participantes dele são regidos pelo
[Código de Conduta FindItNow](https://github.com/freitaseric/finditnowblob/master/CODE_OF_CONDUCT.md).
Ao participar, espera-se que você cumpra este código. Por favor, reporte comportamento inaceitável
para <freitaseric@proton.me>.

## Tenho uma pergunta

> Se você quiser fazer uma pergunta, presumimos que você leu
> a nossa [Documentação](https://github.com/freitaseric/finditnow/wiki).

Antes de fazer uma pergunta, é melhor pesquisar [*issues*](https://github.com/freitaseric/finditnow/issues) existentes
que possam ajudá-lo. Caso você tenha encontrado um problema adequado e ainda precise de esclarecimentos, você pode
escrever sua pergunta nesta *issue*. Também é aconselhável pesquisar primeiro as respostas na Internet.

Se você ainda sentir necessidade de fazer uma pergunta e precisar de esclarecimentos, recomendamos o seguinte:

- Abra uma [*issue*](https://github.com/freitaseric/finditnow/issues/new).
- Forneça o máximo de contexto possível sobre o que você está enfrentando.
- Fornecer versões do projeto e da plataforma (kotlin, gradle, compose, etc), dependendo do que parecer relevante.

Então cuidaremos do problema o mais rápido possível.

## Quero contribuir

> ### Aviso Legal <!-- omit in toc -->
> Ao contribuir para este projeto, você deve concordar que é o autor de 100% do conteúdo, que possui os direitos
> necessários sobre o conteúdo e o conteúdo com o qual você contribui pode ser fornecido sob a licença do projeto.

### Relatando Bugs

<!-- omit in toc -->

#### Antes de enviar um relatório de bug

Um bom relatório de bug não deve fazer com que outras pessoas precisem persegui-lo para obter mais informações.
Portanto, pedimos que você investigue cuidadosamente, colete informações e descreva o problema detalhadamente em seu
relatório. Conclua as etapas a seguir com antecedência para nos ajudar a corrigir qualquer possível bug o mais rápido
possível.

- Certifique-se de estar usando a versão mais recente.
- Determine se o seu bug é realmente um bug e não um erro da sua parte, por exemplo. usando componentes/versões de
  ambiente incompatíveis (certifique-se de ter lido a [documentação](https://github.com/freitaseric/finditnow/wiki). Se
  você estiver procurando suporte, você pode querer verificar [esta seção](#tenho-uma-pergunta)).
- Para ver se outros usuários experimentaram (e possivelmente já resolveram) o mesmo problema que você está tendo,
  verifique se ainda não existe um relatório de bug para seu bug ou erro
  no [bug tracker](https://github.com/freitaseric/finditnow/issues?q=label%3Abug).
- Certifique-se também de pesquisar na Internet (incluindo Stack Overflow) para ver se usuários fora da comunidade
  GitHub discutiram o problema.
- Colete informações sobre o bug:
    - Rastreamento de pilha (Traceback)
    - SO, plataforma e versão (Windows, Linux, macOS, x86, ARM)
    - Versão do interpretador, compilador, SDK, ambiente de execução, gerenciador de pacotes, dependendo do que parecer
      relevante.
    - Possivelmente seu I/O
    - Você consegue reproduzir o problema de forma confiável? E você também pode reproduzi-lo com versões mais antigas?

<!-- omit in toc -->

#### Como faço para enviar um bom relatório de bug?

> Você nunca deve relatar problemas, vulnerabilidades ou bugs relacionados à segurança, incluindo informações
> confidenciais, ao *bug tracker* ou em outro lugar público. Em vez disso, bugs sensíveis devem ser enviados
> por
> e-mail para <freitaseric@proton.me>.

Usamos *issues* do GitHub para rastrear bugs e erros. Se você tiver um problema com o projeto:

- Abra um [issue](https://github.com/freitaseric/finditnow/issues/new). (Como não podemos ter certeza agora
  se é um bug ou não, pedimos que você não fale sobre um bug ainda e não rotule o problema.)
- Explique o comportamento que você esperaria e o comportamento real.
- Forneça o máximo de contexto possível e descreva as *etapas de reprodução* que outra pessoa pode seguir para recriar o
  problema por conta própria. Isso geralmente inclui seu código. Para obter bons relatórios de bugs, você deve isolar o
  problema e criar um caso de teste reduzido.
- Forneça as informações que você coletou na seção anterior.

Após Arquivado:

- A equipe do projeto rotulará o problema de acordo.
- Um membro da equipe tentará reproduzir o problema com as etapas fornecidas. Se não houver etapas de reprodução ou
  nenhuma maneira óbvia de reproduzir o problema, a equipe solicitará essas etapas e marcará o problema
  como `needs-repro`. Bugs com a tag `needs-repro` não serão resolvidos até que sejam reproduzidos.
- Se a equipe conseguir reproduzir o problema, ele será marcado como `needs-fix`, bem como possivelmente
  outras tags (como `critical`), e o problema será deixado para
  ser [implementado por alguém](#sua-primeira-contribuição-de-código).

### Sugerindo Melhorias

Esta seção orienta você no envio de sugestões de melhorias para o FindItNow, **incluindo recursos completamente novos e
pequenas melhorias nas funcionalidades existentes**. Seguir essas diretrizes ajudará os mantenedores e a comunidade a
entender sua sugestão e encontrar sugestões relacionadas.

<!-- omit in toc -->

#### Antes de enviar uma melhoria

- Certifique-se de estar usando a versão mais recente.
- Leia a [documentação](https://github.com/freitaseric/finditnow/wiki) com atenção e descubra se a funcionalidade já
  está coberta, talvez por uma configuração individual.
- Faça uma [pesquisa](https://github.com/freitaseric/finditnow/issues) para ver se a melhoria já foi sugerida. Em caso
  afirmativo, adicione um comentário ao problema existente em vez de abrir um novo.
- Descubra se a sua ideia se enquadra no escopo e objetivos do projeto. Cabe a você apresentar argumentos fortes para
  convencer os desenvolvedores do projeto dos méritos desse recurso. Tenha em mente que queremos recursos que sejam
  úteis para a maioria dos nossos usuários e não apenas para um pequeno subconjunto. Se você tem como alvo apenas uma
  minoria de usuários, considere escrever uma biblioteca de complementos/plugins.

<!-- omit in toc -->

#### Como envio uma boa sugestão de melhoria?

As sugestões de melhorias são rastreadas como [issues do GitHub](https://github.com/freitaseric/finditnow/issues).

- Use um **título claro e descritivo** para o problema para identificar a sugestão.
- Forneça uma **descrição passo a passo da melhoria sugerida** com o máximo de detalhes possível.
- **Descreva o comportamento atual** e **explique qual comportamento você esperava ver** e por quê. Neste ponto você
  também pode dizer quais alternativas não funcionam para você.
- Você pode **incluir capturas de tela e GIFs animados** que ajudam a demonstrar as etapas ou apontar a parte à qual a
  sugestão está relacionada. Você pode usar [esta ferramenta](https://www.cockos.com/licecap/) para gravar GIFs no macOS
  e Windows, e [esta ferramenta](https://github.com/colinkeenan/silentcast)
  ou [esta ferramenta](https://github.com/GNOME/byzanz) no
  Linux.
- **Explique por que esse aprimoramento seria útil** para a maioria dos usuários do FindItNow. Você também pode apontar
  outros projetos que resolveram melhor o problema e que poderiam servir de inspiração.

### Sua primeira contribuição de código

<!-- TODO
inclui configuração de env, IDE e instruções típicas de introdução?

-->

### Melhorando a documentação

<!-- TODO
Atualizando, melhorando e corrigindo a documentação

-->

## Guias de estilo

### Mensagens de Commit

<!-- TODO

-->

## Junte-se à equipe

<!-- TODO -->

<!-- omitir no toc -->

## Atribuição

Este guia é baseado na **contributing-gen**. [Faça o seu próprio](https://github.com/bttger/contributing-gen)!