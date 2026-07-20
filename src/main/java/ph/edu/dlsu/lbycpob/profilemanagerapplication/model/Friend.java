package ph.edu.dlsu.lbycpob.profilemanagerapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.util.Objects;
import java.util.UUID;

/**
 * Maps to public.friends. Unlike a "canonical smaller-UUID-first" scheme,
 * this schema's unique(profile_id, friend_id) constraint is directional --
 * (A,B) and (B,A) are two distinct, independently-insertable rows.
 * <p>
 * id          uuid primary key default gen_random_uuid()
 * profile_id  uuid not null, references profiles(id) on delete cascade
 * friend_id   uuid not null, references profiles(id) on delete cascade
 * unique(profile_id, friend_id); check(profile_id <> friend_id)
 */
