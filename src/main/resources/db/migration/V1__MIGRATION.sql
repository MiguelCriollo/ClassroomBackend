CREATE TABLE IF NOT EXISTS "classroom" (
    "id" SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    "max_students" INTEGER NOT NULL
);

INSERT INTO "classroom" ("name","max_students") VALUES ('Class 1', 20);

CREATE TABLE IF NOT EXISTS "student"
(
    "id"
    SERIAL
    PRIMARY
    KEY,
    "name"
    VARCHAR
(
    100
) NOT NULL,
    "age" INTEGER NOT NULL,
    "class_id" INTEGER NOT NULL,
    FOREIGN KEY
(
    "class_id"
) REFERENCES "classroom"
(
    "id"
)
    );
INSERT INTO "student" ("name", "age", "class_id") VALUES ('Student 1', 10, 1);
