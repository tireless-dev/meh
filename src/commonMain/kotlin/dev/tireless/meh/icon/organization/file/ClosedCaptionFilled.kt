// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClosedCaptionFilled: ImageVector
  get() {
    val current = _closedCaptionFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ClosedCaptionFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 m-13 7 h-5 v6 h5 v2 h-5 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5Z m10 0 h-5 v6 h5 v2 h-5 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // m -13 7
          moveToRelative(dx = -13.0f, dy = 7.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
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
      .also { _closedCaptionFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _closedCaptionFilled: ImageVector? = null
