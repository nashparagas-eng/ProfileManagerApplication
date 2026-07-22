package ph.edu.dlsu.lbycpob.profilemanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Maps to public.profiles. Field-for-field match with the schema:
 * <p>
 * id          uuid primary key default gen_random_uuid()
 * name        text not null, unique
 * status      text not null default ''
 * quote       text not null default ''
 * picture     text not null default '<vercel blob default avatar url>'
 * created_at  timestamptz not null default now()
 */
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @UuidGenerator
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String status = "";

    @Column(nullable = false)
    private String quote = "";
}