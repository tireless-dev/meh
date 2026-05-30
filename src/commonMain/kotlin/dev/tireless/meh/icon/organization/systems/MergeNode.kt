// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MergeNode: ImageVector
  get() {
    val current = _mergeNode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MergeNode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 20 h-4 l-8 -8 -8 8 H4 a2 2 0 0 0 -2 2 v8 h2 v-8 h4 l8 8 8 -8 h4 v8 h2 v-8 a2 2 0 0 0 -2 -2 m-12 7.17 L9.83 21 16 14.83 22.17 21z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 20
          moveTo(x = 28.0f, y = 20.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -12 7.17
          moveToRelative(dx = -12.0f, dy = 7.17f)
          // L 9.83 21
          lineTo(x = 9.83f, y = 21.0f)
          // L 16 14.83
          lineTo(x = 16.0f, y = 14.83f)
          // L 22.17 21z
          lineTo(x = 22.17f, y = 21.0f)
          close()
        }
        // <polygon points="11.0 7.0 16.0 12.0 21.0 7.0 19.5859 5.5859 17.0 8.1719 17.0 2.0 15.0 2.0 15.0 8.1719 12.4141 5.5859 11.0 7.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 11 7
          moveTo(x = 11.0f, y = 7.0f)
          // L 16 12
          lineTo(x = 16.0f, y = 12.0f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // L 19.5859 5.5859
          lineTo(x = 19.5859f, y = 5.5859f)
          // L 17 8.1719
          lineTo(x = 17.0f, y = 8.1719f)
          // L 17 2
          lineTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 8.1719
          lineTo(x = 15.0f, y = 8.1719f)
          // L 12.4141 5.5859
          lineTo(x = 12.4141f, y = 5.5859f)
          // L 11 7z
          lineTo(x = 11.0f, y = 7.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _mergeNode = it }
  }

@Suppress("ObjectPropertyName")
private var _mergeNode: ImageVector? = null
