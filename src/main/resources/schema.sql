CREATE TABLE books (
    id INT NULL,
    name VARCHAR(50) NULL,
    date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    chapters INT NULL, 
    records INT NULL, 
    wordCount INT NULL
);

CREATE TABLE book_items(
    id INT NULL,
    name VARCHAR(50) NULL,
    date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    chapters INT NULL, 
    records INT NULL, 
    wordCount INT NULL
)