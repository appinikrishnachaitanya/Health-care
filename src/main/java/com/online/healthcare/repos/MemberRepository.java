package com.online.healthcare.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.healthcare.models.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {

}
