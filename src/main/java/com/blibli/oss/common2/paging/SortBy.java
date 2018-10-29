package com.blibli.oss.common2.paging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bryan Arista
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SortBy {

  private String propertyName;

  private String direction;
}
