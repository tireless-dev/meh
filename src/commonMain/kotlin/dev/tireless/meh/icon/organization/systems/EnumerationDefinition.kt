// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EnumerationDefinition: ImageVector
  get() {
    val current = _enumerationDefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EnumerationDefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19.53 16.07 c0 -.96 .88 -1.45 1.8 -1.45 1.04 0 1.47 .66 1.47 1.93 V22 H25 v-5.67 c0 -2.24 -1.03 -3.51 -2.87 -3.51 a2.5 2.5 0 0 0 -2.51 1.7 h-.09 v-1.5 h-2.2 V22 h2.2z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.53 16.07
          moveTo(x = 19.53f, y = 16.07f)
          // c 0 -0.96 0.88 -1.45 1.8 -1.45
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.96f,
            dx2 = 0.88f,
            dy2 = -1.45f,
            dx3 = 1.8f,
            dy3 = -1.45f,
          )
          // c 1.04 0 1.47 0.66 1.47 1.93
          curveToRelative(
            dx1 = 1.04f,
            dy1 = 0.0f,
            dx2 = 1.47f,
            dy2 = 0.66f,
            dx3 = 1.47f,
            dy3 = 1.93f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // H 25
          horizontalLineTo(x = 25.0f)
          // v -5.67
          verticalLineToRelative(dy = -5.67f)
          // c 0 -2.24 -1.03 -3.51 -2.87 -3.51
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.24f,
            dx2 = -1.03f,
            dy2 = -3.51f,
            dx3 = -2.87f,
            dy3 = -3.51f,
          )
          // a 2.5 2.5 0 0 0 -2.51 1.7
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.51f,
            dy1 = 1.7f,
          )
          // h -0.09
          horizontalLineToRelative(dx = -0.09f)
          // v -1.5
          verticalLineToRelative(dy = -1.5f)
          // h -2.2
          horizontalLineToRelative(dx = -2.2f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h 2.2z
          horizontalLineToRelative(dx = 2.2f)
          close()
        }
        // <polygon points="14.908 19.9883 9.2693 19.9883 9.2693 16.9282 14.2548 16.9282 14.2548 14.917 9.2693 14.917 9.2693 12.0117 14.908 12.0117 14.908 10.0 7.0 10.0 7.0 22.0 14.908 22.0 14.908 19.9883" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 14.908 19.9883
          moveTo(x = 14.908f, y = 19.9883f)
          // L 9.2693 19.9883
          lineTo(x = 9.2693f, y = 19.9883f)
          // L 9.2693 16.9282
          lineTo(x = 9.2693f, y = 16.9282f)
          // L 14.2548 16.9282
          lineTo(x = 14.2548f, y = 16.9282f)
          // L 14.2548 14.917
          lineTo(x = 14.2548f, y = 14.917f)
          // L 9.2693 14.917
          lineTo(x = 9.2693f, y = 14.917f)
          // L 9.2693 12.0117
          lineTo(x = 9.2693f, y = 12.0117f)
          // L 14.908 12.0117
          lineTo(x = 14.908f, y = 12.0117f)
          // L 14.908 10
          lineTo(x = 14.908f, y = 10.0f)
          // L 7 10
          lineTo(x = 7.0f, y = 10.0f)
          // L 7 22
          lineTo(x = 7.0f, y = 22.0f)
          // L 14.908 22
          lineTo(x = 14.908f, y = 22.0f)
          // L 14.908 19.9883z
          lineTo(x = 14.908f, y = 19.9883f)
          close()
        }
        // M2 4 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 m26 24 H4 V4 h24z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 4
          moveTo(x = 2.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // m 26 24
          moveToRelative(dx = 26.0f, dy = 24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
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
      .also { _enumerationDefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _enumerationDefinition: ImageVector? = null
