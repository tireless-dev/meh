// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FetchUpload: ImageVector
  get() {
    val current = _fetchUpload
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FetchUpload",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 7 6 17 l1.41 1.41 L15 10.83 V28 H2 v2 h13 a2 2 0 0 0 2 -2 V10.83 l7.59 7.58 L26 17Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // L 6 17
          lineTo(x = 6.0f, y = 17.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 15 10.83
          lineTo(x = 15.0f, y = 10.83f)
          // V 28
          verticalLineTo(y = 28.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
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
          // V 10.83
          verticalLineTo(y = 10.83f)
          // l 7.59 7.58
          lineToRelative(dx = 7.59f, dy = 7.58f)
          // L 26 17z
          lineTo(x = 26.0f, y = 17.0f)
          close()
        }
        // M6 8 V4 h20 v4 h2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _fetchUpload = it }
  }

@Suppress("ObjectPropertyName")
private var _fetchUpload: ImageVector? = null
