// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuestionAnswering: ImageVector
  get() {
    val current = _questionAnswering
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.QuestionAnswering",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 15.1798 17.41 12.59 16.0 14.0 20.0 18.0 26.0 12.0 24.59 10.59 20.0 15.1798" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 20 15.1798
          moveTo(x = 20.0f, y = 15.1798f)
          // L 17.41 12.59
          lineTo(x = 17.41f, y = 12.59f)
          // L 16 14
          lineTo(x = 16.0f, y = 14.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 24.59 10.59
          lineTo(x = 24.59f, y = 10.59f)
          // L 20 15.1798z
          lineTo(x = 20.0f, y = 15.1798f)
          close()
        }
        // <rect width="2" height="2" x="8.0" y="18.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M12 9 H7 v2 h4 v2 H8 v3 h2 v-1 h2 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 9
          moveTo(x = 12.0f, y = 9.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
        }
        // M17.74 30 16 29 l4 -7 h6 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h9 v2 H6 a4 4 0 0 1 -4 -4 V8 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v12 a4 4 0 0 1 -4 4 h-4.84z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.74 30
          moveTo(x = 17.74f, y = 30.0f)
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 4 -7
          lineToRelative(dx = 4.0f, dy = -7.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // h -4.84z
          horizontalLineToRelative(dx = -4.84f)
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
      .also { _questionAnswering = it }
  }

@Suppress("ObjectPropertyName")
private var _questionAnswering: ImageVector? = null
