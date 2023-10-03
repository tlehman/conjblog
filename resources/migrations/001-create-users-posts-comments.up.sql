CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR(60) NOT NULL,
  status VARCHAR(10)
  --hashed_password BYTEA NOT NULL CHECK (LENGTH(ENCODE(hashed_password, 'hex')) = 120),
  --salt BYTEA NOT NULL CHECK (LENGTH(ENCODE(salt, 'hex')) = 120)
);
