CREATE TABLE Livro(
    id INTEGER NOT NULL PRIMARY KEY,
    titulo VARCHAR(250) NOT NULL,
    autor VARCHAR(200) NOT NULL,
    genero VARCHAR(50) NOT NULL
);

INSERT INTO Livro (id, titulo, autor, genero) VALUES
    (1, 'Androides Sonham com Ovelhas Elétricas?', 'Philip K. Dick', 'Ficção Científica'),
    (2, 'O Mágico de Oz', 'Lewis Carrol', 'Fantasia'),
    (3, 'Fique Onde Está e Então Corra', 'John Boyne', 'Ficção Histórica'),
    (4, 'Garota Exemplar', 'Gillian Flynn', 'Suspense'),
    (5, 'E Não Sobrou Nenhum', 'Agatha Christie', 'Mistério');

