CREATE TABLE applications  (
                              id          BIGSERIAL PRIMARY KEY,
                              company     VARCHAR(255) NOT NULL,
                              position    VARCHAR(255) NOT NULL,
                              job_url     VARCHAR(2048),
                              status      VARCHAR(32) NOT NULL,
                              applied_at  DATE,
                              notes       TEXT,
                              created_at  TIMESTAMP NOT NULL DEFAULT now(),
                              updated_at  TIMESTAMP NOT NULL DEFAULT now()
);