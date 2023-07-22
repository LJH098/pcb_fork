package com.oldandsea.pcb.domain.dto.request;

import com.oldandsea.pcb.domain.dto.layer.CommentUpdateContentList;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentUpdateContentRequestDTO {
    private List<CommentUpdateContentList> updateContentList;
    @Builder
    public CommentUpdateContentRequestDTO(List<CommentUpdateContentList> updateContentList) {
        this.updateContentList = updateContentList;
    }
}
