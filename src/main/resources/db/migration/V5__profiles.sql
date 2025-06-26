CREATE TABLE profiles (
    id bigint NOT NULL
                      PRIMARY KEY,
    bio VARCHAR(10000) NULL,
    phone_number TINYINT NULL,
    date_of_birth DATE NULL,
    loyalty_points INT UNSIGNED NOT NULL DEFAULT 0,
    CONSTRAINT profiles_users_id_fk
        FOREIGN KEY (id) REFERENCES users(id)
);