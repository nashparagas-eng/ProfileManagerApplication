package ph.edu.dlsu.lbycpob.profilemanagerapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.dto.Dtos.ApiError;

import java.util.NoSuchElementException;
