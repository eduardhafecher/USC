# UltraSerratecCombat [USC] 
Um projeto de minigame em Java / Turma 2025.01 / Fullstack / Serratec

Esse jogo é uma adaptação do código que o professor Gustavo Guanabara usa como exemplo nas aulas 7a, 7b, 8a e 8b em seu curso gratuito de POO + Java disponível no youtube*. No exemplo  o professor monta passo a passo uma espécie de duelo no estilo UFC. Minha ideia foi transformar essa “batalha” em um Duelo entre os Alunos de Programação do Serratec. 

No UltraSerratecCombat, vence aquele que consegue montar seu código primeiro. A cada rodada, um número aleatório é sorteado pelo programa, e cada número corresponde a uma pontuação que o aluno vai acumulando. Os pontos levam nomes de assuntos que os alunos já aprenderam (nas disciplinas de Lógica de Programação, Banco de Dados e POO). O aluno que alcançar os 100 pontos conclui o código e vence o game.

📌 Features

Esses foram os pontos do código do professor Guanabara que adaptei:

✅ As classes Lutador e Luta viraram Aluno e Duelo, respectivamente.

✅ Alterei os atributos do Aluno, já que peso, altura e nacionalidade não são relevantes em um contexto de duelo de alunos.

✅ No código do professor, o peso e a categoria do lutador são atributos conectados. A partir do peso, o programa determina a categoria automaticamente, usando um if. Eu mantive a ideia, trocando os atributos: a experiência do Aluno determina seu nível.

✅ Alterei a forma como o duelo se desenvolve. No código do professor o resultado é determinado através de um sorteio aleatório entre 1 e 3, onde 1 imprime na tela empate, 2 vitória do desafiante e 3 vitória do desafiado. Incrementei essa parte aumentando o range desse Random (0 a 4). Cada número corresponde a uma pontuação diferente de ataque.

✅ Alterei a possibilidade de empate. Ainda pretendo melhorar esse ponto, mas por hora, os jogadores empatam se alcançarem, em um mesmo turno, 75 pontos. Minha intenção é simular um cenário onde ambas se esforçam mas não conseguem avançar no código.

✅ Adicionei uma chamada para aumentar a experiência dos alunos após cada embate. Quem vence ganha +3 pontos de experiência, e quem perde, +1 ponto.

✅ Adicionei uma abertura para o duelo, usando uma imagem ASCII.

✅ Adicionei a participação dos nossos professores ao jogo. Eles assumem uma posição de “elemento surpresa”, podendo fazer a pontuação do jogador aumentar ou fazer o jogador ter que recomeçar o código.

*Assista a Playlist aqui: @gustavoguanabara
https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY

