package ru.innopolis.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface CreateAtIdentified extends Serializable {
    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updatedAt);
}
