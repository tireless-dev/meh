// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZHyperLink: ImageVector
  get() {
    val current = _zHyperLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ZHyperLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 5 v22 a2 2 0 0 1 -2 2 h-8 a2 2 0 0 1 -2 -2 v-4 h2 v4 h8 V5 h-8 v4 h-2 V5 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 M13 27 H5 V5 h8 v4 h2 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-4 h-2z m.1 -14.3 -1.4 -1.4 L7 16 l4.7 4.7 1.4 -1.4 -2.3 -2.3 h10.4 l-2.3 2.3 1.4 1.4 L25 16 l-4.7 -4.7 -1.4 1.4 2.3 2.3 H10.8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 5
          moveTo(x = 29.0f, y = 5.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // M 13 27
          moveTo(x = 13.0f, y = 27.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
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
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 0.1 -14.3
          moveToRelative(dx = 0.1f, dy = -14.3f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // L 7 16
          lineTo(x = 7.0f, y = 16.0f)
          // l 4.7 4.7
          lineToRelative(dx = 4.7f, dy = 4.7f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // h 10.4
          horizontalLineToRelative(dx = 10.4f)
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // L 25 16
          lineTo(x = 25.0f, y = 16.0f)
          // l -4.7 -4.7
          lineToRelative(dx = -4.7f, dy = -4.7f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // H 10.8z
          horizontalLineTo(x = 10.8f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
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
      .also { _zHyperLink = it }
  }

@Suppress("ObjectPropertyName")
private var _zHyperLink: ImageVector? = null
