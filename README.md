# TDE 1 – Manipulação de Pilhas e Filas Dinâmicas

## 1. Descrição Geral
Este trabalho implementa três estruturas dinâmicas em **Java**, utilizando **listas encadeadas simples**:

1. **Pilha Dinâmica (LIFO – Last In, First Out)**
2. **Fila Dinâmica (FIFO – First In, First Out)**
3. **Merge de Filas Ordenadas** (gera uma terceira fila ordenada a partir de duas filas já ordenadas)

Regras seguidas conforme enunciado:
- Apenas **tipos primitivos** utilizados.
- **Proibido** uso de `Vector`, `StringBuilder`, `length`, `array[]` e outras estruturas prontas.
- Entrada de dados feita com `Scanner`.
- O usuário sempre é informado sobre o elemento removido.

---

## 2. Estrutura dos Arquivos
- Pilha.java → implementação da **Pilha Dinâmica** com menu interativo.
- Fila.java → implementação da **Fila Dinâmica** com menu interativo.
- Merge.java → implementação do **Merge de duas filas ordenadas**.

---

## 3. Como Compilar e Executar

### Passo 1 – Salvar os arquivos
Baixe/salve os três arquivos:
- Pilha.java
- Fila.java
- Merge.java

### Passo 2 – Compilar
No terminal, execute o comando de compilação para cada arquivo:
javac Pilha.java
javac Fila.java
javac Merge.java

### Passo 3 – Executar
Para rodar cada programa:
java Pilha
java Fila
java Merge

---

## 4. Exemplos de Execução

### Item 1 – Pilha Dinâmica
Inserindo 10, 20, 30:
Topo -> 30 | 20 | 10 <- Base

Removendo:
Elemento removido: 30
Topo -> 20 | 10 <- Base

---

### Item 2 – Fila Dinâmica
Inserindo 10, 20, 30:
Frente -> 10 | 20 | 30 <- Tras

Removendo:
Elemento removido: 10
Frente -> 20 | 30 <- Tras

---

### Item 3 – Merge de Filas Ordenadas
Entrada:  
Fila A = 12 → 35 → 52 → 64  
Fila B = 05 → 15 → 23 → 55 → 75  

Execução do Merge:
Fila A (entrada):
Frente -> 12 | 35 | 52 | 64 <- Tras
Fila B (entrada):
Frente -> 5 | 15 | 23 | 55 | 75 <- Tras

Fila C (resultado do MERGE):
Frente -> 5 | 12 | 15 | 23 | 35 | 52 | 55 | 64 | 75 <- Tras

---

## 5. Observações
- Caso a pilha ou fila esteja **vazia** e o usuário tente remover, o programa informa:  
  Nao ha elemento para remover.
- No **merge**, as filas A e B devem ser fornecidas **já em ordem crescente**.
- Todos os exemplos acima foram testados e validados.

---
