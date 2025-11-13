USE booksdb;
SELECT * FROM books;
USE booksdb;

INSERT INTO books (title, description, language, number_of_pages, created_at, updated_at)
VALUES 
('Book One', 'First book description', 'English', 150, NOW(), NOW()),
('Book Two', 'Second book description', 'French', 200, NOW(), NOW()),
('Book Three', 'Third book description', 'Arabic', 180, NOW(), NOW());
SELECT * FROM books;
