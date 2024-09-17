package com.project.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.board.dto.CommentDTO;
import com.project.board.mapper.CommentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
	private final CommentMapper commentMapper;

	public void save(CommentDTO commentDTO) {
		commentMapper.save(commentDTO);
		
	}

	public List<CommentDTO> findAll(Long boardId) {
		return commentMapper.findAll(boardId);
	}
}
